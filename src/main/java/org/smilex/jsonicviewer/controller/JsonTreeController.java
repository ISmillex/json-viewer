package org.smilex.jsonicviewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import org.smilex.jsonicviewer.viewer.TreeNode;
import org.smilex.jsonicviewer.viewer.TreeBuilder;

@Controller
public class JsonTreeController {

    TreeBuilder builder = new TreeBuilder();

    @PostMapping("/json-tree")
    public String getJsonTree(@RequestParam String json, Model model) {
        TreeNode tree = this.builder.buildTreeFromJson(json);
        System.out.println(tree);
        model.addAttribute("tree", tree);
        return "tree";
    }

}
