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
        type: 'ajax',
        url: '/data/MenuData.json'
    }
});

//var treeMenu = Ext.create('Ext.tree.Panel', {
Ext.define("app.view.TreeMenu", {
    extend: "Ext.tree.Panel",
    alias : 'widget.treeMenu',
//    title: 'Simple Tree',
//    width: 200,
//    forceFit: true,
//    id: "treeMenu",
    store: menuStore,
    rootVisible: false,
    constructor: function(config) {
        this.callParent(arguments); // calls Ext.tip.ToolTip's constructor
        //...
    },
    border: false
//    renderTo: Ext.getBody()
});