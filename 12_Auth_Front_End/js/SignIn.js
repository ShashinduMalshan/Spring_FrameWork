
    document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("signInForm");
    const usernameInput = document.getElementById("username");
    const passwordInput = document.getElementById("password");

    form.addEventListener("submit", function (e) {
    e.preventDefault(); // prevent form from submitting

    const username = usernameInput.value.trim();
    const password = passwordInput.value.trim();

    if (!username || !password) {
    alert("Please fill out both username and password!");
    return;
}

    // Show data in console (for now)
    console.log("Username:", username);
    console.log("Password:", password);

    // You can send data to backend API here using fetch() or AJAX
    alert("Login success! (Test only)");

    // Optional: clear form
    // form.reset();
});
});