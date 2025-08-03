
    document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");
    const emailInput = document.getElementById("email");
    const usernameInput = document.getElementById("username");
    const passwordInput = document.getElementById("password");

    form.addEventListener("submit", function (event) {
    event.preventDefault(); // prevent form from submitting normally

    const email = emailInput.value.trim();
    const username = usernameInput.value.trim();
    const password = passwordInput.value.trim();

    // Basic validation
    if (!email || !username || !password) {
    alert("All fields are required!");
    return;
}

    // If all fields are filled, you can send data to backend here
    console.log("Email:", email);
    console.log("Username:", username);
    console.log("Password:", password);

    alert("Sign In successful! (Test only)");

    // Optionally reset form
    // form.reset();
});
});

