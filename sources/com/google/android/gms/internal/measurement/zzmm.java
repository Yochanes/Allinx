package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzmm {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzml zzmlVar, String str) {
        StringBuilder sbM21r = AbstractC0000a.m21r("# ", str);
        zza(zzmlVar, sbM21r, 0);
        return sbM21r.toString();
    }

    private static void zza(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    public static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zznt.zza(zzjs.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjs) {
            sb.append(": \"");
            sb.append(zznt.zza((zzjs) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzlc) {
            sb.append(" {");
            zza((zzlc) obj, sb, i + 2);
            sb.append("\n");
            zza(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            zza(sb, i3, "key", entry.getKey());
            zza(sb, i3, "value", entry.getValue());
            sb.append("\n");
            zza(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzml zzmlVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmlVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    zza(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzlc.zza(method2, zzmlVar, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zza(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzlc.zza(method, zzmlVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objZza = zzlc.zza(method4, zzmlVar, new Object[0]);
                            if (method5 == null) {
                                zBooleanValue = true;
                                if (objZza instanceof Boolean) {
                                    zEquals = !((Boolean) objZza).booleanValue();
                                } else if (objZza instanceof Integer) {
                                    if (((Integer) objZza).intValue() == 0) {
                                    }
                                } else if (objZza instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                    }
                                } else if (objZza instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                    }
                                } else if (objZza instanceof String) {
                                    zEquals = objZza.equals("");
                                } else if (objZza instanceof zzjs) {
                                    zEquals = objZza.equals(zzjs.zza);
                                } else if (!(objZza instanceof zzml) ? !(objZza instanceof Enum) || ((Enum) objZza).ordinal() != 0 : objZza != ((zzml) objZza).zzck()) {
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) zzlc.zza(method5, zzmlVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                zza(sb, i, strSubstring, objZza);
                            }
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (zzmlVar instanceof zzlc.zzd) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzlc.zzd) zzmlVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zznw zznwVar = ((zzlc) zzmlVar).zzb;
        if (zznwVar != null) {
            zznwVar.zza(sb, i);
        }
    }
}
