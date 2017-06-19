package com.datazuul.apps.notepad.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDaoImpl implements FileDao {

  public FileDaoImpl() {
    super();
  }

  @Override
  public char[] read(File file) {
    char[] data = null;

    FileReader fin = null;
    try {
      fin = new FileReader(file);
      int filesize = (int) file.length();
      data = new char[filesize];
      fin.read(data, 0, filesize);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return data;
  }

  @Override
  public void save(File file, String text) {
    try {
      FileWriter fw = new FileWriter(file);
      int textsize = text.length();
      fw.write(text, 0, textsize);
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
