/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

Ext.Loader.setConfig({
    enabled: true,
      paths: {  
          'app': 'app'  
      }  
});



Ext.application({
    name: "app",
    appFolder: "app",
    requires: ['app.view.Viewport'],
    controllers: [],
    launch: function(profile) {
        Ext.create("app.view.Viewport").show();
    }
})