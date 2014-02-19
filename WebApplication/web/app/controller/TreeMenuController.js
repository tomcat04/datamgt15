/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


Ext.define('app.controller.TreeMenuController', {
    extend: 'Ext.app.Controller',
    init: function() {
        this.control({
            'treeMenu': {
                render:function(){
//                    console.info('render');
                },
                itemclick:function(view, record, item, index, e, eOpts){
//                    console.info('itemclick');
                        console.info(record);
                }
            }
        });
        
    }
});  