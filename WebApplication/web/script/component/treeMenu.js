/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

var menuStore = Ext.create('Ext.data.TreeStore', {
    root: {
        expanded: true
//        children: [
//            {text: "detention", leaf: true},
//            {text: "homework", expanded: true, children: [
//                    {text: "book report", leaf: true},
//                    {text: "algebra", leaf: true}
//                ]},
//            {text: "buy lottery tickets", leaf: true}
//        ]
    },
    proxy: {
        type:  'ajax',
        url:  '/script/data/MenuData.json'
    }
});

var treeMenu = Ext.create('Ext.tree.Panel', {
//    title: 'Simple Tree',
//    width: 200,
//    forceFit: true,
    store: menuStore,
    rootVisible: false,
    border: false
//    renderTo: Ext.getBody()
});