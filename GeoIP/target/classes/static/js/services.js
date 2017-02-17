countryApp.service("countryService", ['$http', function ($http) {

    var baseUrl = '/GeoIP';

    this.getCountry = function (ipAddress) {
        return $http.get(baseUrl + '/getCountry/' + ipAddress);
    };
}]);


