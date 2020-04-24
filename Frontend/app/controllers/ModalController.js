app.controller('AlarmController', ['$scope',
    function ($scope) {
        $scope.modalShown = false
        $scope.openRisk = function () {
            alert('Your Room is in a high danger .Please contact our service for help and get immediate actions');
        }
        $scope.openModel = function (i) {
            $scope.modalShown = !$scope.modalShown;
            $scope.selected = i.co2;
            $scope.selected2 = i.smoke;
            $scope.Roomno = i.roomNo;

            if ($scope.selected >= 5 && $scope.selected2 >= 5) {
                $scope.Alert = "Risky";
            } else {
                $scope.Alert = "Good";
            }
        };

        $scope.isSelected = function (i) {
            return $scope.selected === i.co2;
            return $scope.selected2 === i.smoke;

        }

        $scope.getAlert = function (i) {
            if (i.co2 >= 5 && i.smoke >= 5) {
                return " Highly Risky !(click here)";
            }
        }
    }
]);
