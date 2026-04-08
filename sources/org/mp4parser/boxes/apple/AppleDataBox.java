package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import java.util.HashMap;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AppleDataBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58270d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58271f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58272g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58273i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58274j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58275n;

    static {
        Factory factory = new Factory(AppleDataBox.class, "AppleDataBox.java");
        f58270d = factory.m21739e(factory.m21738d("getLanguageString", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "java.lang.String"));
        f58271f = factory.m21739e(factory.m21738d("getDataType", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"));
        f58272g = factory.m21739e(factory.m21738d("getDataCountry", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"));
        f58273i = factory.m21739e(factory.m21738d("setDataCountry", "org.mp4parser.boxes.apple.AppleDataBox", "int", "dataCountry", "", "void"));
        f58274j = factory.m21739e(factory.m21738d("getDataLanguage", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"));
        f58275n = factory.m21739e(factory.m21738d("setDataLanguage", "org.mp4parser.boxes.apple.AppleDataBox", "int", "dataLanguage", "", "void"));
        HashMap map = new HashMap();
        map.put("0", "English");
        map.put("1", "French");
        map.put("2", "German");
        map.put("3", "Italian");
        map.put("4", "Dutch");
        map.put("5", "Swedish");
        map.put("6", "Spanish");
        map.put("7", "Danish");
        map.put("8", "Portuguese");
        map.put("9", "Norwegian");
        map.put("10", "Hebrew");
        map.put("11", "Japanese");
        map.put("12", "Arabic");
        map.put("13", "Finnish");
        map.put("14", "Greek");
        map.put("15", "Icelandic");
        map.put("16", "Maltese");
        map.put("17", "Turkish");
        map.put("18", "Croatian");
        map.put("19", "Traditional_Chinese");
        map.put("20", "Urdu");
        map.put("21", "Hindi");
        map.put("22", "Thai");
        map.put("23", "Korean");
        map.put("24", "Lithuanian");
        map.put("25", "Polish");
        map.put("26", "Hungarian");
        map.put("27", "Estonian");
        map.put("28", "Lettish");
        map.put("29", "Sami");
        map.put("30", "Faroese");
        map.put("31", "Farsi");
        map.put("32", "Russian");
        map.put("33", "Simplified_Chinese");
        map.put("34", "Flemish");
        map.put("35", "Irish");
        map.put("36", "Albanian");
        map.put("37", "Romanian");
        map.put("38", "Czech");
        map.put("39", "Slovak");
        map.put("40", "Slovenian");
        map.put("41", "Yiddish");
        map.put("42", "Serbian");
        map.put("43", "Macedonian");
        map.put("44", "Bulgarian");
        map.put("45", "Ukrainian");
        map.put("46", "Belarusian");
        map.put("47", "Uzbek");
        map.put("48", "Kazakh");
        map.put("49", "Azerbaijani");
        map.put("50", "AzerbaijanAr");
        map.put("51", "Armenian");
        map.put("52", "Georgian");
        map.put("53", "Moldavian");
        map.put("54", "Kirghiz");
        map.put("55", "Tajiki");
        map.put("56", "Turkmen");
        map.put("57", "Mongolian");
        map.put("58", "MongolianCyr");
        map.put("59", "Pashto");
        map.put("60", "Kurdish");
        map.put("61", "Kashmiri");
        map.put("62", "Sindhi");
        map.put("63", "Tibetan");
        map.put("64", "Nepali");
        map.put("65", "Sanskrit");
        map.put("66", "Marathi");
        map.put("67", "Bengali");
        map.put("68", "Assamese");
        map.put("69", "Gujarati");
        map.put("70", "Punjabi");
        map.put("71", "Oriya");
        map.put("72", "Malayalam");
        map.put("73", "Kannada");
        map.put("74", "Tamil");
        map.put("75", "Telugu");
        map.put("76", "Sinhala");
        map.put("77", "Burmese");
        map.put("78", "Khmer");
        map.put("79", "Lao");
        map.put("80", "Vietnamese");
        map.put("81", "Indonesian");
        map.put("82", "Tagalog");
        map.put("83", "MalayRoman");
        map.put("84", "MalayArabic");
        map.put("85", "Amharic");
        map.put("87", "Galla");
        map.put("87", "Oromo");
        map.put("88", "Somali");
        map.put("89", "Swahili");
        map.put("90", "Kinyarwanda");
        map.put("91", "Rundi");
        map.put("92", "Nyanja");
        map.put("93", "Malagasy");
        map.put("94", "Esperanto");
        map.put("128", "Welsh");
        map.put("129", "Basque");
        map.put("130", "Catalan");
        map.put("131", "Latin");
        map.put("132", "Quechua");
        map.put("133", "Guarani");
        map.put("134", "Aymara");
        map.put("135", "Tatar");
        map.put("136", "Uighur");
        map.put("137", "Dzongkha");
        map.put("138", "JavaneseRom");
        map.put("32767", "Unspecified");
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(mo21822d() + 16);
        byteBuffer.put("data".getBytes());
        byteBuffer.putInt(0);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.put(mo21823e());
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return mo21822d() + 16;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo21822d();

    /* JADX INFO: renamed from: e */
    public abstract byte[] mo21823e();
}
