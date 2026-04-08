package io.intercom.android.sdk.blocks.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TextSplittingStrategy {
    private static final String NEW_LINE = "\n";
    private static final String NEW_LINE_REPLACEMENT = "<br>";
    private static final String NEW_PARAGRAPH_DELIMETER = "\n\n";

    public List<String> apply(String str) {
        String[] strArrSplit = str.split(NEW_PARAGRAPH_DELIMETER);
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = strArrSplit[i].replace(NEW_LINE, NEW_LINE_REPLACEMENT);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
        arrayList.removeAll(Collections.singleton(""));
        return arrayList;
    }
}
