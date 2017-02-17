countryApp.controller("countryController", function($scope, countryService) {

    $scope.lookUp = function (ipAddress) {
        countryService.getCountry(ipAddress)
            .then(function (response) {

                if(response.data.length != 0){
                    $scope.country = response.data;
                }else {
                }

            }, function (error) {
            });
    };

});





