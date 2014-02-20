/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


Ext.define('app.controller.TreeMenuController', {
    extend: 'Ext.app.Controller',
    init: function() {
        this.control({
            'treeMenu': {
                itemclick: function(view, record, item, index, e, eOpts) {
                    var tabs = Ext.getCmp('myMainPageTabPanel');
                    var myTabTitle = record.get('text');
                    var tab = tabs.query('[title=' + myTabTitle + ']');
                    if (tab.length === 0) {
                        var newtab = tabs.add({
                            title: myTabTitle,
                            closable: true
                        });
                        tabs.setActiveTab(newtab);
                    }else{
                        tabs.setActiveTab(tab[0]);
                    }

                }
            }
        });

    }
});  