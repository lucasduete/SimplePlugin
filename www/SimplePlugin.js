var exec = require('cordova/exec');

exports.callService = function (arg0, success, error) {
    exec(success, error, 'SimplePlugin', 'callService', [arg0]);
};
