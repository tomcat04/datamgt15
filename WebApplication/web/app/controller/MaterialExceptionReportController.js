
Ext.define("app.controller.MaterialExceptionReportController", {
    extend: "Ext.app.Controller",
    init: function() {
        this.control({
        });
        
    },
    views:[
      'MaterialExceptionReportGrid'  
    ],
    stores:[
        'MaterialExceptionLogStore'
    ],
    models:[
        'MaterialExceptionLogModel'
    ]
});
