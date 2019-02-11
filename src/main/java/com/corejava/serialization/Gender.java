package com.corejava.serialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Gender implements Serializable {
  public final static Gender MALE   = new Gender("Male");
  public final static Gender FEMALE = new Gender("Female");

  private String name;

  private Gender(String name) {
    this.name = name;
  }

  Object writeReplace() throws ObjectStreamException {
    if (this.equals(MALE)) {
      return SerializedForm.MALE_FORM;
    } else {
      return SerializedForm.FEMALE_FORM;
    }
  }

  private static class SerializedForm implements Serializable {

    final static SerializedForm MALE_FORM   = new SerializedForm(0);
    final static SerializedForm FEMALE_FORM = new SerializedForm(1);

    private int value;

    SerializedForm(int value) {
      this.value = value;
    }

    Object readResolve() throws ObjectStreamException {
      if (value == MALE_FORM.value) {
        return Gender.MALE;
      } else {
        return Gender.FEMALE;
      }
    }
  }
}