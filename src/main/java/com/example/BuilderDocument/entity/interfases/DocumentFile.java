package com.example.BuilderDocument.entity.interfases;

import java.util.ArrayList;
import java.util.List;

public interface DocumentFile {
    List<Block> blocks = new ArrayList<>();

    List<Block> getBlocks();
}
