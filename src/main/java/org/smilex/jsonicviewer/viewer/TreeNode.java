package org.smilex.jsonicviewer.viewer;

import java.util.*;

import org.smilex.jsonicviewer.parser.JValue;

public class TreeNode {
    private String name;
    private Map<String, TreeNode> data;
    private JValue value;


    public TreeNode(String name, JValue value) {
        this.name = name;
        this.data = new HashMap<>();
        this.value = value;
    }

    public List<TreeNode> getChilds() {
        List<TreeNode> childs = new ArrayList<>(this.data.values());
        childs.sort(Comparator.comparingInt(TreeNode::getChildrenCount));
        return childs;
    }

    public boolean hasChildren() {
        return !this.data.isEmpty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, TreeNode> getData() {
        return data;
    }

    public String getType() {
        if (value.isObject()) {
            return "object";
        } else if (value.isArray()) {
            return "array";
        } else if (value.isNumber()) {
            return "number";
        } else if (value.isString()) {
            return "string";
        } else {
            return "literal";
        }
    }

    public int getChildrenCount() {
        return this.data.size();
    }

    public String getValue() {
        if (this.value.isString()) {
            return "\"" + this.value.toString() + "\"";
        } else {
            return this.value.toString();
        }
    }

}