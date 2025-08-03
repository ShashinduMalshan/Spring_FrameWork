document.addEventListener("DOMContentLoaded", function () {
    console.log("Dashboard loaded for user: Sandaru");

    const logoutBtn = document.querySelector("button.btn-outline-primary");
    logoutBtn.addEventListener("click", function () {
        const confirmLogout = confirm("Are you sure you want to logout?");
        if (confirmLogout) {
            window.location.href = "SignIn.html"; // or your login page
        }
    });
});