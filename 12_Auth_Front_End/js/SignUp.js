$(document).ready(function () {
    $("#signUpBtn").on("click", function () {
        const username = $("#username").val().trim();
        const password = $("#password").val().trim();
        const role = $("#role").val();

        // 🔎 Debug logs
        console.log("Username:", username);
        console.log("Password:", password);
        console.log("Role:", role);

        // Basic validation
        if (!username || !password || !role) {
            alert("All fields are required!");
            return;
        }

        const requestData = {
            username: username,
            password: password,
            role: role
        };

        $.ajax({
            url: "http://localhost:8080/auth/register",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify(requestData),
            success: function (response) {
                console.log("Registration successful:", response);
                alert("Sign Up successful!");
                // Optionally redirect:
                window.location.href = "../Pages/SingIn.html";
            },
            error: function (xhr) {
                console.error("Registration failed:", xhr.responseText);
                try {
                    const err = JSON.parse(xhr.responseText);
                    alert(err.message || "Sign Up failed. Please try again.");
                } catch {
                    alert("Sign Up failed. Please try again.");
                }
            }
        });
    });
});
