let ID;
loadAllJobs();
$(document).ready(function () {
    $("#jobsTableBody").on("click", "tr", function () {
        $("#jobsTableBody tr td").removeClass("selected-row"); // Remove highlight from all cells
        $(this).find("td").addClass("selected-row"); // Highlight only the clicked row's cells
    });
});



$("#saveJobBtn").click(function () {
    let jobTitle = $("#jobTitle").val();
    let companyName = $("#companyName").val();
    let jobLocation = $("#jobLocation").val();
    let jobType = $("#jobType").val();
    let jobDescription = $("#jobDescription").val();

    let job = {
        jobTitle: jobTitle,
        company: companyName,
        location: jobLocation,
        type: jobType,
        jobDescription: jobDescription,
        status: "Pending"

    };

    $.ajax({
        url: "http://localhost:8080/api/v1/job/create",
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify(job),
        success: function (response) {
            alert("Job added successfully!");
            location.reload();
        },
       error: function(error) {
            console.error('Error saving job:', error);
            // Optionally, show an error message to the user
        }
    });
});



    function loadAllJobs() {
        $.ajax({
            url: "http://localhost:8080/api/v1/job/all",
            method: "GET",
            success: function (response) {
                // Clear old data
                $('#jobsTableBody').empty();

                // Loop through each job and append to a table
                response.forEach(function (job) {
                    let row = `
                <tr>
                    <td>${job.id}</td>
                    <td>${job.jobTitle}</td>
                    <td>${job.company}</td>
                    <td>${job.location}</td>
                    <td>${job.type}</td>
                    <td>${job.jobDescription}</td>
                    <td>${job.status}</td>
                </tr>`;
                    $('#jobsTableBody').append(row);
                });
            },


            error: function (error) {
                console.error("Error loading job data:", error);
                alert("Failed to load job list.");
            }
        });
    }

$("#jobsTableBody").on("click", "tr", function () {
    // Extract values from the clicked row
    let rowData = $(this).children("td").map(function () {
        return $(this).text();
    }).get();

    // Assign values to modal form fields
    id = $("#editJobId").val(rowData[0]); // hidden input
    $("#editJobTitle").val(rowData[1]);
    $("#editCompanyName").val(rowData[2]);
    $("#editJobLocation").val(rowData[3]);
    $("#editJobType option").filter(function () {
        return $(this).text().trim() === rowData[4].trim();
    }).prop("selected", true);
        $("#editJobDescription").val(rowData[5]);
    console.log(rowData);
    // console.log("id " + $("#editJobId").val());

});


$("#updateJobBtn").click(function () {


     id = $("#editJobId").val();
    let jobTitle = $("#editJobTitle").val();
    let companyName = $("#editCompanyName").val();
    let jobLocation = $("#editJobLocation").val();
    let jobType = $("#editJobType").val();
    let jobDescription = $("#editJobDescription").val();


    let job = {
        jobTitle: jobTitle,
        company: companyName,
        location: jobLocation,
        type: jobType,
        jobDescription: jobDescription,
        status: "Pending"

    };

    $.ajax({
        url: "http://localhost:8080/api/v1/job/update/" +id,
        method: "PUT",
        contentType: "application/json",
        data: JSON.stringify(job),
        success: function (response) {
            alert("Job added successfully!");
            location.reload();
        },
        error: function (error) {
            console.error('Error saving job:', error);
            // Optionally, show an error message to the user
        }
    });
});


$('#searchInput').on('input', function () {

    if ($("#searchInput").val() === "") {
        loadAllJobs();
        return;
    }
    $.ajax({
    url: "http://localhost:8080/api/v1/job/search/"+$("#searchInput").val(),
    method: "GET",
    success: function (response) {
        // Clear old data
        $('#jobsTableBody').empty();

        if (response.length === 0) {
                $('#jobsTableBody').append(`
                    <tr>
                        <td colspan="7" style="text-align: center;">No jobs found</td>
                    </tr>`);
        }
        // Loop through each job and append to a table

        else{
        response.forEach(function (job) {
            let row = `
                <tr>
                    <td>${job.id}</td>
                    <td>${job.jobTitle}</td>
                    <td>${job.company}</td>
                    <td>${job.location}</td>
                    <td>${job.type}</td>
                    <td>${job.jobDescription}</td>
                    <td>${job.status}</td>
                </tr>`;
            $('#jobsTableBody').append(row);
        });}
    },


    error: function (error) {
        console.error("Error loading job data:", error);
        alert("Failed to load job list.");
    }
    });

});