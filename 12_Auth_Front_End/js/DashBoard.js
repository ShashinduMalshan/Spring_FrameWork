


$(document).ready(function () {
const token = localStorage.getItem("token");

  if (!token) {
      alert("Please login first!");
      window.location.href = "../Pages/SingIn.html";

  }else {
      loadDashBord();
  }


})
function loadDashBord() {
    console.log("Dashboard loaded for user: Shasidu");

    $("button.btn-outline-primary").on("click", function () {
        const confirmLogout = confirm("Are you sure you want to logout?");
        if (confirmLogout) {
            localStorage.removeItem("token"); // Clear token on logout
            window.location.href = "../Pages/SingIn.html";
        }
    });
}
