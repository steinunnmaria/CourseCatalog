
var db = require("./database.js")

// Create express app
var express = require("express")
var app = express()

// Server port
var HTTP_PORT = 8000
// Start server
app.listen(HTTP_PORT, () => {
    console.log("Server running on port %PORT%".replace("%PORT%",HTTP_PORT))
});
// Root endpoint
app.get("/", (req, res, next) => {
    res.json({"message":"Ok"})
    // Hér þarf að gera eitthvað
    // eitthvað með db hlutinn, hann býr til base gagnagrunn (db.sqlite)
    // Telma skoða betur mögulega
});

// Insert here other API endpoints

// Default response for any other request
app.use(function(req, res){
    res.status(404);
});
