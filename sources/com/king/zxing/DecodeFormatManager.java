package com.king.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DecodeFormatManager {

    /* JADX INFO: renamed from: a */
    public static final EnumMap f43295a;

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        BarcodeFormat barcodeFormat = BarcodeFormat.CODE_128;
        m15396a(new EnumMap(DecodeHintType.class), Collections.singletonList(barcodeFormat));
        BarcodeFormat barcodeFormat2 = BarcodeFormat.QR_CODE;
        m15396a(new EnumMap(DecodeHintType.class), Collections.singletonList(barcodeFormat2));
        EnumMap enumMap2 = new EnumMap(DecodeHintType.class);
        EnumMap enumMap3 = new EnumMap(DecodeHintType.class);
        EnumMap enumMap4 = new EnumMap(DecodeHintType.class);
        f43295a = enumMap4;
        ArrayList arrayList = new ArrayList();
        BarcodeFormat barcodeFormat3 = BarcodeFormat.AZTEC;
        arrayList.add(barcodeFormat3);
        BarcodeFormat barcodeFormat4 = BarcodeFormat.CODABAR;
        arrayList.add(barcodeFormat4);
        BarcodeFormat barcodeFormat5 = BarcodeFormat.CODE_39;
        arrayList.add(barcodeFormat5);
        BarcodeFormat barcodeFormat6 = BarcodeFormat.CODE_93;
        arrayList.add(barcodeFormat6);
        arrayList.add(barcodeFormat);
        BarcodeFormat barcodeFormat7 = BarcodeFormat.DATA_MATRIX;
        arrayList.add(barcodeFormat7);
        BarcodeFormat barcodeFormat8 = BarcodeFormat.EAN_8;
        arrayList.add(barcodeFormat8);
        BarcodeFormat barcodeFormat9 = BarcodeFormat.EAN_13;
        arrayList.add(barcodeFormat9);
        BarcodeFormat barcodeFormat10 = BarcodeFormat.ITF;
        arrayList.add(barcodeFormat10);
        BarcodeFormat barcodeFormat11 = BarcodeFormat.MAXICODE;
        arrayList.add(barcodeFormat11);
        BarcodeFormat barcodeFormat12 = BarcodeFormat.PDF_417;
        arrayList.add(barcodeFormat12);
        arrayList.add(barcodeFormat2);
        BarcodeFormat barcodeFormat13 = BarcodeFormat.RSS_14;
        arrayList.add(barcodeFormat13);
        BarcodeFormat barcodeFormat14 = BarcodeFormat.RSS_EXPANDED;
        arrayList.add(barcodeFormat14);
        BarcodeFormat barcodeFormat15 = BarcodeFormat.UPC_A;
        arrayList.add(barcodeFormat15);
        BarcodeFormat barcodeFormat16 = BarcodeFormat.UPC_E;
        arrayList.add(barcodeFormat16);
        BarcodeFormat barcodeFormat17 = BarcodeFormat.UPC_EAN_EXTENSION;
        arrayList.add(barcodeFormat17);
        m15396a(enumMap, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(barcodeFormat4);
        arrayList2.add(barcodeFormat5);
        arrayList2.add(barcodeFormat6);
        arrayList2.add(barcodeFormat);
        arrayList2.add(barcodeFormat8);
        arrayList2.add(barcodeFormat9);
        arrayList2.add(barcodeFormat10);
        arrayList2.add(barcodeFormat13);
        arrayList2.add(barcodeFormat14);
        arrayList2.add(barcodeFormat15);
        arrayList2.add(barcodeFormat16);
        arrayList2.add(barcodeFormat17);
        m15396a(enumMap2, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(barcodeFormat3);
        arrayList3.add(barcodeFormat7);
        arrayList3.add(barcodeFormat11);
        arrayList3.add(barcodeFormat12);
        arrayList3.add(barcodeFormat2);
        m15396a(enumMap3, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(barcodeFormat2);
        arrayList4.add(barcodeFormat15);
        arrayList4.add(barcodeFormat9);
        arrayList4.add(barcodeFormat);
        m15396a(enumMap4, arrayList4);
    }

    /* JADX INFO: renamed from: a */
    public static void m15396a(EnumMap enumMap, List list) {
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, list);
        enumMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        enumMap.put(DecodeHintType.CHARACTER_SET, "UTF-8");
    }
}
