app.directive('modal', function() {
    return {
        restrict: 'E',
        scope: {
            show: '='
        },
        replace: true, // Replace with template
        transclude: true, // To use custom content
        link: function(scope, element, attrs) {

            scope.windowStyle = {};

            if (attrs.width) {
                scope.windowStyle.width = attrs.width;
            }
            if (attrs.height) {
                scope.windowStyle.height = attrs.height;
            }

            scope.hideModal = function() {
                scope.show = false;
            };

        },
        template: "<div ng-show='show'>" +
            "<div  class='modal-overlay' ng-click='hideModal()'>" + "</div>" +
            "<div   class='modal-background'  ng-style='windowStyle'>" +

            "<div  class='modal-content'  ng-transclude  ></div>" +
            "<div class='modal-footer' style='background-color: black' >"+
            "<button  ng-click='hideModal()'>close</button>" +"</div>"+
            "</div>" +
            "</div>"
    };
});
