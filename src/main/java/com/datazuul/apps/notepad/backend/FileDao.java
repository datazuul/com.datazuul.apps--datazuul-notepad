package com.datazuul.apps.notepad.backend;

import java.io.File;

public interface FileDao {

    public char[] read(File file);

    public void save(File file, String text);
}
