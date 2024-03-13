package org.smilex.jsonicviewer.viewer;

import org.smilex.jsonicviewer.parser.Jsonic;
import org.smilex.jsonicviewer.parser.JValue;
import org.smilex.jsonicviewer.parser.JObject;
import org.smilex.jsonicviewer.parser.JArray;

public class TreeBuilder {

    private TreeNode root;
    public TreeNode buildTreeFromJson(String jsonString) {
        JValue jsonValue = Jsonic.parse(jsonString);
        this.root = buildTree(jsonValue, "root");
        return this.root;
    }

    private TreeNode buildTree(JValue jsonValue, String name) {
        TreeNode node = new TreeNode(name, jsonValue);

        if (jsonValue.isObject()) {
            JObject jsonObject = jsonValue.asObject();
            for (String key : jsonObject.keys()) {
                TreeNode child = buildTree(jsonObject.get(key), key);
                node.getData().put(key, child);
            }
        } else if (jsonValue.isArray()) {
            JArray jsonArray = jsonValue.asArray();
            int index = 0;
            for (JValue value : jsonArray) {
                TreeNode child = buildTree(value, String.valueOf(index));
                node.getData().put(String.valueOf(index++), child);
            }
        } else {
            TreeNode leafNode = new TreeNode(name, jsonValue);
            node.getData().put("value", leafNode);
        }

        return node;
    }

}