package com.din.calculator;

import java.util.HashMap;
import java.util.Map;


public class DinTable {

    private Map<Tuple, Double> dinTable = new HashMap<>();

    static final String UP_TO_230 = "UP TO 230";
    static final String FROM_231_TO_250 = "FROM 231 TO 250";
    static final String FROM_251_TO_270 = "FROM 251 TO 270";
    static final String FROM_271_TO_290 = "FROM 271 TO 290";
    static final String FROM_291_TO_310 = "FROM 291 TO 310";
    static final String FROM_311_TO_330 = "FROM 311 TO 330";
    static final String FROM_331_TO_350 = "FROM 331 TO 350";
    static final String ABOVE_351 = "ABOVE 351";

    public Map<Tuple, Double> getDinTable() {
        dinTable.put(new Tuple(1, UP_TO_230), 0.75);
        dinTable.put(new Tuple(2, UP_TO_230), 1.00);
        dinTable.put(new Tuple(3, UP_TO_230), 1.50);
        dinTable.put(new Tuple(4, UP_TO_230), 2.00);
        dinTable.put(new Tuple(5, UP_TO_230), 2.50);
        dinTable.put(new Tuple(6, UP_TO_230), 3.00);
        dinTable.put(new Tuple(1, FROM_231_TO_250), 0.75);
        dinTable.put(new Tuple(2, FROM_231_TO_250), 0.75);
        dinTable.put(new Tuple(3, FROM_231_TO_250), 1.25);
        dinTable.put(new Tuple(4, FROM_231_TO_250), 1.75);
        dinTable.put(new Tuple(5, FROM_231_TO_250), 2.25);
        dinTable.put(new Tuple(6, FROM_231_TO_250), 2.75);
        dinTable.put(new Tuple(7, FROM_231_TO_250), 3.50);
        dinTable.put(new Tuple(1, FROM_251_TO_270), 0.75);
        dinTable.put(new Tuple(2, FROM_251_TO_270), 0.75);
        dinTable.put(new Tuple(3, FROM_251_TO_270), 1.25);
        dinTable.put(new Tuple(4, FROM_251_TO_270), 1.50);
        dinTable.put(new Tuple(5, FROM_251_TO_270), 2.00);
        dinTable.put(new Tuple(6, FROM_251_TO_270), 2.50);
        dinTable.put(new Tuple(7, FROM_251_TO_270), 3.00);
        dinTable.put(new Tuple(8, FROM_251_TO_270), 3.50);
        dinTable.put(new Tuple(9, FROM_251_TO_270), 4.50);
        dinTable.put(new Tuple(10, FROM_251_TO_270), 5.50);
        dinTable.put(new Tuple(11, FROM_251_TO_270), 6.50);
        dinTable.put(new Tuple(12, FROM_251_TO_270), 7.50);
        dinTable.put(new Tuple(2, FROM_271_TO_290), 0.75);
        dinTable.put(new Tuple(3, FROM_271_TO_290), 1.00);
        dinTable.put(new Tuple(4, FROM_271_TO_290), 1.50);
        dinTable.put(new Tuple(5, FROM_271_TO_290), 1.75);
        dinTable.put(new Tuple(6, FROM_271_TO_290), 2.25);
        dinTable.put(new Tuple(7, FROM_271_TO_290), 2.75);
        dinTable.put(new Tuple(8, FROM_271_TO_290), 3.00);
        dinTable.put(new Tuple(9, FROM_271_TO_290), 4.00);
        dinTable.put(new Tuple(10, FROM_271_TO_290), 5.00);
        dinTable.put(new Tuple(11, FROM_271_TO_290), 6.00);
        dinTable.put(new Tuple(12, FROM_271_TO_290), 7.00);
        dinTable.put(new Tuple(13, FROM_271_TO_290), 8.50);
        dinTable.put(new Tuple(14, FROM_271_TO_290), 10.00);
        dinTable.put(new Tuple(15, FROM_271_TO_290), 11.50);
        dinTable.put(new Tuple(4, FROM_291_TO_310), 1.25);
        dinTable.put(new Tuple(5, FROM_291_TO_310), 1.50);
        dinTable.put(new Tuple(6, FROM_291_TO_310), 2.00);
        dinTable.put(new Tuple(7, FROM_291_TO_310), 2.50);
        dinTable.put(new Tuple(8, FROM_291_TO_310), 3.00);
        dinTable.put(new Tuple(9, FROM_291_TO_310), 3.50);
        dinTable.put(new Tuple(10, FROM_291_TO_310), 4.50);
        dinTable.put(new Tuple(11, FROM_291_TO_310), 5.50);
        dinTable.put(new Tuple(12, FROM_291_TO_310), 6.50);
        dinTable.put(new Tuple(13, FROM_291_TO_310), 8.00);
        dinTable.put(new Tuple(14, FROM_291_TO_310), 9.50);
        dinTable.put(new Tuple(15, FROM_291_TO_310), 11.00);
        dinTable.put(new Tuple(5, FROM_311_TO_330), 1.50);
        dinTable.put(new Tuple(6, FROM_311_TO_330), 1.75);
        dinTable.put(new Tuple(7, FROM_311_TO_330), 2.25);
        dinTable.put(new Tuple(8, FROM_311_TO_330), 2.75);
        dinTable.put(new Tuple(9, FROM_311_TO_330), 3.50);
        dinTable.put(new Tuple(10, FROM_311_TO_330), 4.00);
        dinTable.put(new Tuple(11, FROM_311_TO_330), 5.00);
        dinTable.put(new Tuple(12, FROM_311_TO_330), 6.00);
        dinTable.put(new Tuple(13, FROM_311_TO_330), 7.00);
        dinTable.put(new Tuple(14, FROM_311_TO_330), 8.50);
        dinTable.put(new Tuple(15, FROM_311_TO_330), 10.00);
        dinTable.put(new Tuple(16, FROM_311_TO_330), 12.00);
        dinTable.put(new Tuple(6, FROM_331_TO_350), 1.75);
        dinTable.put(new Tuple(7, FROM_331_TO_350), 2.00);
        dinTable.put(new Tuple(8, FROM_331_TO_350), 2.50);
        dinTable.put(new Tuple(9, FROM_331_TO_350), 3.00);
        dinTable.put(new Tuple(10, FROM_331_TO_350), 3.50);
        dinTable.put(new Tuple(11, FROM_331_TO_350), 4.50);
        dinTable.put(new Tuple(12, FROM_331_TO_350), 5.50);
        dinTable.put(new Tuple(13, FROM_331_TO_350), 6.50);
        dinTable.put(new Tuple(14, FROM_331_TO_350), 8.00);
        dinTable.put(new Tuple(15, FROM_331_TO_350), 9.50);
        dinTable.put(new Tuple(16, FROM_331_TO_350), 11.00);
        dinTable.put(new Tuple(10, ABOVE_351), 3.00);
        dinTable.put(new Tuple(11, ABOVE_351), 4.00);
        dinTable.put(new Tuple(12, ABOVE_351), 5.00);
        dinTable.put(new Tuple(13, ABOVE_351), 6.00);
        dinTable.put(new Tuple(14, ABOVE_351), 7.50);
        dinTable.put(new Tuple(15, ABOVE_351), 9.00);
        dinTable.put(new Tuple(16, ABOVE_351), 10.50);

        return dinTable;
    }
}
