app.filter('searchFor', function () {
    return function (arr, search) {
        if (!search) {
            return arr;
        }

        let result = [];

        search = search.toLowerCase();

        angular.forEach(arr, function (item) {
            if (item.SensorID.toLowerCase().indexOf(search) !== -1) {
                result.push(item);
            }
        });

        return result;
    };
});

function MainController($scope, $http) {
    $scope.items = [];
    $http.get("http://localhost:8080/getAll").then(function (response) {
        $scope.items = response.data;
    });

    $scope.getStatusFromResponseEnum = function (statusCode) {
        if (statusCode == 0) {
            return "Inactive";
        } else if (statusCode == 1) {
            return "Active";
        } else {
            return "";
        }
    };

    // $scope.items = [
    //     {
    //         SensorID: "1A",
    //         FloorNo: "2",
    //         RoomNo: "201",
    //         CO2:2,
    //         Smoke:3,
    //         status:"Active"
    //
    //
    //
    //     },
    //     {
    //         SensorID: "2A",
    //         FloorNo: "2",
    //         RoomNo: "202",
    //         CO2:6,
    //         Smoke:7,
    //         status:"Active"
    //
    //
    //     },
    //     {
    //         SensorID: " 3A",
    //         FloorNo: "2",
    //         RoomNo: "203",
    //         CO2:3,
    //         Smoke:5,
    //         status:"Active"
    //     },
    //     {
    //         SensorID: "4A",
    //         FloorNo: "2",
    //         RoomNo: "204",
    //         CO2:5,
    //         Smoke:3,
    //         status:"Active"
    //     }, {
    //
    //         SensorID: "5A",
    //         FloorNo: "2",
    //         RoomNo: "205",
    //         CO2:8,
    //         Smoke:5,
    //         status:"Active"
    //     }
    // ];
}



