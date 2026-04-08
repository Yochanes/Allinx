package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class StateSet {

    /* JADX INFO: renamed from: a */
    public final int f22896a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f22897b = new SparseArray();

    /* JADX INFO: compiled from: Proguard */
    public static class State {

        /* JADX INFO: renamed from: a */
        public final int f22898a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f22899b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final int f22900c;

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.f22900c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22886r);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f22898a = typedArrayObtainStyledAttributes.getResourceId(index, this.f22898a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22900c);
                    this.f22900c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Variant {

        /* JADX INFO: renamed from: a */
        public final float f22901a;

        /* JADX INFO: renamed from: b */
        public final float f22902b;

        /* JADX INFO: renamed from: c */
        public final float f22903c;

        /* JADX INFO: renamed from: d */
        public final float f22904d;

        /* JADX INFO: renamed from: e */
        public final int f22905e;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.f22901a = Float.NaN;
            this.f22902b = Float.NaN;
            this.f22903c = Float.NaN;
            this.f22904d = Float.NaN;
            this.f22905e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22890v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22905e);
                    this.f22905e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f22904d = typedArrayObtainStyledAttributes.getDimension(index, this.f22904d);
                } else if (index == 2) {
                    this.f22902b = typedArrayObtainStyledAttributes.getDimension(index, this.f22902b);
                } else if (index == 3) {
                    this.f22903c = typedArrayObtainStyledAttributes.getDimension(index, this.f22903c);
                } else if (index == 4) {
                    this.f22901a = typedArrayObtainStyledAttributes.getDimension(index, this.f22901a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7376a(float f, float f2) {
            float f3 = this.f22901a;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f22902b;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f22903c;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.f22904d;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StateSet(Context context, XmlResourceParser xmlResourceParser) {
        this.f22896a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22887s);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f22896a = typedArrayObtainStyledAttributes.getResourceId(index, this.f22896a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            State state = null;
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            b2 = name.equals("State") ? (byte) 2 : (byte) -1;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b2 = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b2 == 2) {
                        state = new State(context, xmlResourceParser);
                        this.f22897b.put(state.f22898a, state);
                    } else if (b2 == 3) {
                        Variant variant = new Variant(context, xmlResourceParser);
                        if (state != null) {
                            state.f22899b.add(variant);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7374a(float f, float f2, int i, int i2) {
        State state = (State) this.f22897b.get(i2);
        if (state == null) {
            return i2;
        }
        ArrayList<Variant> arrayList = state.f22899b;
        int i3 = state.f22900c;
        if (f != -1.0f && f2 != -1.0f) {
            Variant variant = null;
            for (Variant variant2 : arrayList) {
                if (variant2.m7376a(f, f2)) {
                    if (i != variant2.f22905e) {
                        variant = variant2;
                    }
                }
            }
            return variant != null ? variant.f22905e : i3;
        }
        if (i3 != i) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i == ((Variant) it.next()).f22905e) {
                }
            }
            return i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final int m7375b(int i) {
        float f = -1;
        SparseArray sparseArray = this.f22897b;
        int i2 = 0;
        if (-1 == i) {
            State state = i == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(-1);
            if (state != null) {
                while (true) {
                    ArrayList arrayList = state.f22899b;
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((Variant) arrayList.get(i2)).m7376a(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? state.f22900c : ((Variant) state.f22899b.get(i2)).f22905e;
                }
            }
        } else {
            State state2 = (State) sparseArray.get(i);
            if (state2 != null) {
                while (true) {
                    ArrayList arrayList2 = state2.f22899b;
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((Variant) arrayList2.get(i2)).m7376a(f, f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? state2.f22900c : ((Variant) state2.f22899b.get(i2)).f22905e;
            }
        }
        return -1;
    }
}
