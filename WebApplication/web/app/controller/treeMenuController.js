/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


Ext.define('My.controller.Menu', {
    extend: 'Ext.app.Controller',
    views: ['Menu'],
    init: function() {
        this.control({
            'mainMenu menuitem[action=submenu1]': {
                click: this.submenu1OnClick
            }
        });
    },
    submenu1OnClick: function() {
        // do something...  
    }
});  