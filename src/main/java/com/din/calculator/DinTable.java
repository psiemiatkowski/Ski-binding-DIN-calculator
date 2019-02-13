package com.din.calculator;

import java.util.HashMap;
import java.util.Map;

import static com.din.calculator.Constance.*;


public class DinTable {

    private Map<Tuple, Double> dinTable = new HashMap<>();

    public Map<Tuple, Double> getDinTable() {
        dinTable.put(new Tuple(1, S_UP_TO_230), 0.75);
        dinTable.put(new Tuple(2, S_UP_TO_230), 1.00);
        dinTable.put(new Tuple(3, S_UP_TO_230), 1.50);
        dinTable.put(new Tuple(4, S_UP_TO_230), 2.00);
        dinTable.put(new Tuple(5, S_UP_TO_230), 2.50);
        dinTable.put(new Tuple(6, S_UP_TO_230), 3.00);
        dinTable.put(new Tuple(1, S_FROM_231_TO_250), 0.75);
        dinTable.put(new Tuple(2, S_FROM_231_TO_250), 0.75);
        dinTable.put(new Tuple(3, S_FROM_231_TO_250), 1.25);
        dinTable.put(new Tuple(4, S_FROM_231_TO_250), 1.75);
        dinTable.put(new Tuple(5, S_FROM_231_TO_250), 2.25);
        dinTable.put(new Tuple(6, S_FROM_231_TO_250), 2.75);
        dinTable.put(new Tuple(7, S_FROM_231_TO_250), 3.50);
        dinTable.put(new Tuple(1, S_FROM_251_TO_270), 0.75);
        dinTable.put(new Tuple(2, S_FROM_251_TO_270), 0.75);
        dinTable.put(new Tuple(3, S_FROM_251_TO_270), 1.25);
        dinTable.put(new Tuple(4, S_FROM_251_TO_270), 1.50);
        dinTable.put(new Tuple(5, S_FROM_251_TO_270), 2.00);
        dinTable.put(new Tuple(6, S_FROM_251_TO_270), 2.50);
        dinTable.put(new Tuple(7, S_FROM_251_TO_270), 3.00);
        dinTable.put(new Tuple(8, S_FROM_251_TO_270), 3.50);
        dinTable.put(new Tuple(9, S_FROM_251_TO_270), 4.50);
        dinTable.put(new Tuple(10, S_FROM_251_TO_270), 5.50);
        dinTable.put(new Tuple(11, S_FROM_251_TO_270), 6.50);
        dinTable.put(new Tuple(12, S_FROM_251_TO_270), 7.50);
        dinTable.put(new Tuple(2, S_FROM_271_TO_290), 0.75);
        dinTable.put(new Tuple(3, S_FROM_271_TO_290), 1.00);
        dinTable.put(new Tuple(4, S_FROM_271_TO_290), 1.50);
        dinTable.put(new Tuple(5, S_FROM_271_TO_290), 1.75);
        dinTable.put(new Tuple(6, S_FROM_271_TO_290), 2.25);
        dinTable.put(new Tuple(7, S_FROM_271_TO_290), 2.75);
        dinTable.put(new Tuple(8, S_FROM_271_TO_290), 3.00);
        dinTable.put(new Tuple(9, S_FROM_271_TO_290), 4.00);
        dinTable.put(new Tuple(10, S_FROM_271_TO_290), 5.00);
        dinTable.put(new Tuple(11, S_FROM_271_TO_290), 6.00);
        dinTable.put(new Tuple(12, S_FROM_271_TO_290), 7.00);
        dinTable.put(new Tuple(13, S_FROM_271_TO_290), 8.50);
        dinTable.put(new Tuple(14, S_FROM_271_TO_290), 10.00);
        dinTable.put(new Tuple(15, S_FROM_271_TO_290), 11.50);
        dinTable.put(new Tuple(4, S_FROM_291_TO_310), 1.25);
        dinTable.put(new Tuple(5, S_FROM_291_TO_310), 1.50);
        dinTable.put(new Tuple(6, S_FROM_291_TO_310), 2.00);
        dinTable.put(new Tuple(7, S_FROM_291_TO_310), 2.50);
        dinTable.put(new Tuple(8, S_FROM_291_TO_310), 3.00);
        dinTable.put(new Tuple(9, S_FROM_291_TO_310), 3.50);
        dinTable.put(new Tuple(10, S_FROM_291_TO_310), 4.50);
        dinTable.put(new Tuple(11, S_FROM_291_TO_310), 5.50);
        dinTable.put(new Tuple(12, S_FROM_291_TO_310), 6.50);
        dinTable.put(new Tuple(13, S_FROM_291_TO_310), 8.00);
        dinTable.put(new Tuple(14, S_FROM_291_TO_310), 9.50);
        dinTable.put(new Tuple(15, S_FROM_291_TO_310), 11.00);
        dinTable.put(new Tuple(5, S_FROM_311_TO_330), 1.50);
        dinTable.put(new Tuple(6, S_FROM_311_TO_330), 1.75);
        dinTable.put(new Tuple(7, S_FROM_311_TO_330), 2.25);
        dinTable.put(new Tuple(8, S_FROM_311_TO_330), 2.75);
        dinTable.put(new Tuple(9, S_FROM_311_TO_330), 3.50);
        dinTable.put(new Tuple(10, S_FROM_311_TO_330), 4.00);
        dinTable.put(new Tuple(11, S_FROM_311_TO_330), 5.00);
        dinTable.put(new Tuple(12, S_FROM_311_TO_330), 6.00);
        dinTable.put(new Tuple(13, S_FROM_311_TO_330), 7.00);
        dinTable.put(new Tuple(14, S_FROM_311_TO_330), 8.50);
        dinTable.put(new Tuple(15, S_FROM_311_TO_330), 10.00);
        dinTable.put(new Tuple(16, S_FROM_311_TO_330), 12.00);
        dinTable.put(new Tuple(6, S_FROM_331_TO_350), 1.75);
        dinTable.put(new Tuple(7, S_FROM_331_TO_350), 2.00);
        dinTable.put(new Tuple(8, S_FROM_331_TO_350), 2.50);
        dinTable.put(new Tuple(9, S_FROM_331_TO_350), 3.00);
        dinTable.put(new Tuple(10, S_FROM_331_TO_350), 3.50);
        dinTable.put(new Tuple(11, S_FROM_331_TO_350), 4.50);
        dinTable.put(new Tuple(12, S_FROM_331_TO_350), 5.50);
        dinTable.put(new Tuple(13, S_FROM_331_TO_350), 6.50);
        dinTable.put(new Tuple(14, S_FROM_331_TO_350), 8.00);
        dinTable.put(new Tuple(15, S_FROM_331_TO_350), 9.50);
        dinTable.put(new Tuple(16, S_FROM_331_TO_350), 11.00);
        dinTable.put(new Tuple(10, S_ABOVE_351), 3.00);
        dinTable.put(new Tuple(11, S_ABOVE_351), 4.00);
        dinTable.put(new Tuple(12, S_ABOVE_351), 5.00);
        dinTable.put(new Tuple(13, S_ABOVE_351), 6.00);
        dinTable.put(new Tuple(14, S_ABOVE_351), 7.50);
        dinTable.put(new Tuple(15, S_ABOVE_351), 9.00);
        dinTable.put(new Tuple(16, S_ABOVE_351), 10.50);

        return dinTable;
    }
}
