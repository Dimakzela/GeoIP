var countryApp = angular.module("countryApp", ["ngResource", "ngRoute"])
    .config(function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "partials/country.html",
                controller: "countryController"
            })
            .otherwise({
                redirectTo: "/"
            });
    });