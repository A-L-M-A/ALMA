/*
 *
 *
 *
 */

package de.affect.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.StringTokenizer;

public class Convert {

  protected Convert() {
  }
  
  public static double doubleValue(String valueString) {
    if (valueString == null) return -100.0d;
    if (valueString.equals("null")) return 0.0d;
    if (valueString.equals("neutral")) return 0.0d;
    if (valueString.equals("little")) return 0.16d;
    if (valueString.equals("mild")) return 0.33d;
    if (valueString.equals("medium")) return 0.5d;
    if (valueString.equals("strong")) return 0.66d;
    if (valueString.equals("immense")) return 0.83d;
    if (valueString.equals("full")) return 1.0d;
    if (valueString.equals("slightly")) return 0.33d; //mood intensity
    if (valueString.equals("moderate")) return 0.66d; //mood intensity
    if (valueString.equals("fully")) return 1.0d; //mood intensity
    if (valueString.equals("true")) return 1.0d;
    if (valueString.equals("false")) return -1.0d;

    Double doubleNum = new Double(valueString);
    return doubleNum.doubleValue();
  }

  public static double doubleValue(float floatNum) {
    Double doubleNum = new Double((double)floatNum);
    return doubleNum.doubleValue();
  }

  public static int intValue(String valueString) {
    Integer intNum = new Integer(valueString);
    return intNum.intValue();
  }

  public static String valueDescription(double value) {
    String result =
      ((value >= 0.0d) && (value < 1.74d)) ? "full" : 
      ((value >= 1.74d) && (value < 5.24d)) ? "high" : 
      ((value >= 5.24d) && (value < 9.0d)) ? "medium" : 
      ((value >= 9.0d) && (value < 12.47d)) ? "low" : "none";
    return result;
  }

  public static String prettyPrint(double value) {
    DecimalFormat form = new DecimalFormat("0.00");
    DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
    formSymbols.setDecimalSeparator('.');
    form.setDecimalFormatSymbols(formSymbols);
    return form.format(value);
  }

  public static String prettyPrint(float value) {
    DecimalFormat form = new DecimalFormat("0.00");
    DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
    formSymbols.setDecimalSeparator('.');
    form.setDecimalFormatSymbols(formSymbols);
    return form.format(value);
  }

  public static String makeStringList(String[] input) {
    if (input == null)
      return "";
    if (input.length == 0)
      return "";
    String result = "";
    for (String item : input)
      result += item + ",";
    if (result.length() > 1)
      return result.substring(0, result.length() - 1);
    else
      return "";
  }

}