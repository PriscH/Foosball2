var path = require("path");
var vueLoaderPlugin = require('vue-loader/lib/plugin');
var webpack = require("webpack");

const ROOT = path.resolve(__dirname, 'src/main/js');
const DEST = path.resolve(__dirname, 'build/resources/main/static');

module.exports = {
    entry: ROOT + '/main.js',
    output: {
        path: DEST,
        filename: 'js/bundle.js'
    },
    module: {
        rules: [{
            test: /\.vue$/,
            loader: 'vue-loader'
        }, {
            test: /\.js$/,
            loader: 'babel-loader',
            exclude: /node_modules/
        }]
    },
    plugins: [
        new vueLoaderPlugin()
    ]
};
