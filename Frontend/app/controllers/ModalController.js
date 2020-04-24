app.controller('AlarmController', ['$scope',
    function($scope) {
        $scope.modalShown = false
        $scope.openRisk =function(){
                alert('Your Room is in a high danger .Please contact our service for help and get immediate actions');
            return;

        }
        $scope.openModel = function(i) {
            $scope.modalShown = !$scope.modalShown;
            $scope.selected=i.CO2;
            $scope.selected2=i.Smoke;
            $scope.Roomno=i.RoomNo;

            if($scope.selected>=5 && $scope.selected2>=5){
                 $scope.Alert="Risky";
            }
            else{
                 $scope.Alert="Good";
            }



        };
        $scope.isSelected=function(i){
            return $scope.selected===i.CO2;
            return $scope.selected2===i.Smoke;

        }
        $scope.getAlert=function(i){
            if(i.CO2>=5 && i.Smoke>=5){
                return " Highly Risky !(click here)";
            }


        }



    }
]);
