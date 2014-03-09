/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

  Ext.Loader.setConfig({enabled: true});
  Ext.Loader.setPath('app', 'app');



Ext.application({
    name: "app",
    appFolder: "app",
    controllers: [
        'app.controller.TreeMenuController',
        'app.controller.MaterialExceptionReportController'
    ],
    launch: function(profile) {
        Ext.create("app.view.Viewport",{id:"mainViewport"}).show();
    }
});