$(document).ready(function () {
    $("#signInBtn").on("click", function () {
        const username = $("#username").val().trim();
        const password = $("#password").val().trim();

        if (!username || !password) {
            alert("Please fill out both username and password!");
            return;
        }

        const loginData = {
            username: username,
            password: password
        };

        $.ajax({
            url: "http://localhost:8080/auth/login",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify(loginData),
            success: function (response) {
                console.log("Login successful:", response);

                // Extract token safely from your response
                const token = response.accessToken || (response.data && response.data.accessToken);
                if (!token) {
                    alert("Token missing in server response.");
                    return;
                }

                // Store token in localStorage
                localStorage.setItem("token", token);
                console.log("Token stored:", token);

                // Decode JWT to get user role
                const decoded = parseJwt(token);
                console.log("Decoded token:", decoded);

                if (decoded && decoded.role) {
                    if (decoded.role === "Admin") {
                        alert("Welcome Admin!");
                    } else if (decoded.role === "User") {
                        alert("Welcome User!");
                    } else {
                        alert("Welcome!");
                    }
                } else {
                    alert("Logged in, but role not found.");
                }

                // Redirect after successful login
                window.location.href ="../Pages/DashBord.html";
            },
            error: function (xhr) {
                console.error("Login failed:", xhr.responseText);
                try {
                    const err = JSON.parse(xhr.responseText);
                    alert(err.message || "Login failed: Invalid username or password.");
                } catch {
                    alert("Login failed: Invalid username or password.");
                }
            }
        });
    });
});

// JWT decode helper function
function parseJwt(token) {
    try {
        const base64Url = token.split('.')[1];
        const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
        const jsonPayload = decodeURIComponent(
            atob(base64)
                .split('')
                .map(c => '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2))
                .join('')
        );
        return JSON.parse(jsonPayload);
    } catch (e) {
        console.error("Invalid token format", e);
        return null;
    }
}
