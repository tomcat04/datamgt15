
Ext.define("app.view.TreeMenu", {
    extend: "Ext.tree.Panel",
    alias : 'widget.TreeMenu',
//    title: 'Simple Tree',
//    width: 200,
//    forceFit: true,
//    id: "treeMenu",
    store: 'MenuStore',
    rootVisible: false,
    constructor: function(config) {
        this.callParent(arguments); // calls Ext.tip.ToolTip's constructor
        //...
    },
    border: false
//    renderTo: Ext.getBody()
});