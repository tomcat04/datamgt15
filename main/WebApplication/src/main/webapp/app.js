  Ext.Loader.setConfig({enabled: true});

Ext.application({
    name: "app",
    appFolder: "/WebApplication/app",
    controllers: [
        'app.controller.TreeMenuController',
        'app.controller.MainPageGridController',
        'app.controller.MaterialExceptionLogGridController',
        'app.controller.MaterialExceptionReportController'
    ],
    launch: function(profile) {
        Ext.create("app.view.Viewport",{id:"mainViewport"}).show();
    }
});