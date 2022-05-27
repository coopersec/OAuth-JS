// Create a simple express js api
var express = require('express'),
    app = express(),
    bodyParser = require('body-parser');

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', function (req, res) {
    res.send('Hello World!');
});

app.get('/multiply/:x/:y', function (req, res) {
    var x = req.params.x;
    var y = req.params.y;
    res.send(x * y);
});

app.post('/add', function (req, res) {
    var x = req.body.x;
    var y = req.body.y;
    res.send(x + y);
});

app.listen(3000, function () {
    console.log('Example app listening on port 3000!');
});