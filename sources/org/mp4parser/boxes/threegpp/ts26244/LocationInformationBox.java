package org.mp4parser.boxes.threegpp.ts26244;

import com.engagelab.privates.push.constants.MTPushConstants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LocationInformationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f59175A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f59176B;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59177j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59178n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59179o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59180p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59181q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59182r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59183s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59184t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59185u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f59186v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f59187w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f59188x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f59189y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f59190z;

    static {
        Factory factory = new Factory(LocationInformationBox.class, "LocationInformationBox.java");
        f59177j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"));
        f59178n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "language", "", "void"));
        f59187w = factory.m21739e(factory.m21738d("getAltitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "double"));
        f59188x = factory.m21739e(factory.m21738d("setAltitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "double", "altitude", "", "void"));
        f59189y = factory.m21739e(factory.m21738d("getAstronomicalBody", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"));
        f59190z = factory.m21739e(factory.m21738d("setAstronomicalBody", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"));
        f59175A = factory.m21739e(factory.m21738d("getAdditionalNotes", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"));
        f59176B = factory.m21739e(factory.m21738d("setAdditionalNotes", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"));
        f59179o = factory.m21739e(factory.m21738d("getName", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"));
        f59180p = factory.m21739e(factory.m21738d("setName", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "name", "", "void"));
        f59181q = factory.m21739e(factory.m21738d("getRole", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "int"));
        f59182r = factory.m21739e(factory.m21738d("setRole", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "int", "role", "", "void"));
        f59183s = factory.m21739e(factory.m21738d("getLongitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "double"));
        f59184t = factory.m21739e(factory.m21738d("setLongitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "double", MTPushConstants.Geofence.KEY_LONGITUDE, "", "void"));
        f59185u = factory.m21739e(factory.m21738d("getLatitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "double"));
        f59186v = factory.m21739e(factory.m21738d("setLatitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "double", MTPushConstants.Geofence.KEY_LATITUDE, "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21853d(byteBuffer, null);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) (0 & 255));
        IsoTypeWriter.m21851b(byteBuffer, 0.0d);
        IsoTypeWriter.m21851b(byteBuffer, 0.0d);
        IsoTypeWriter.m21851b(byteBuffer, 0.0d);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21860a(null).length + 22 + Utf8.m21860a(null).length + Utf8.m21860a(null).length;
    }
}
