package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p013ui.input.key.Key;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.p013ui.input.key.Key_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/text/KeyMapping_androidKt$platformDefaultKeyMapping$1", "Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KeyMapping_androidKt$platformDefaultKeyMapping$1 implements KeyMapping {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KeyCommand m3228a(KeyEvent keyEvent) {
        KeyCommand keyCommand;
        KeyCommand keyCommand2;
        KeyCommand keyCommand3 = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long jM5520a = Key_androidKt.m5520a(keyEvent.getKeyCode());
            if (Key.m5515a(jM5520a, MappedKeys.f8556i)) {
                keyCommand = KeyCommand.f8444U;
            } else if (Key.m5515a(jM5520a, MappedKeys.f8557j)) {
                keyCommand = KeyCommand.f8445V;
            } else if (Key.m5515a(jM5520a, MappedKeys.f8558k)) {
                keyCommand = KeyCommand.f8436M;
            } else if (Key.m5515a(jM5520a, MappedKeys.f8559l)) {
                keyCommand = KeyCommand.f8437N;
            }
        } else if (keyEvent.isAltPressed()) {
            long jM5520a2 = Key_androidKt.m5520a(keyEvent.getKeyCode());
            keyCommand = Key.m5515a(jM5520a2, MappedKeys.f8556i) ? KeyCommand.f8461o : Key.m5515a(jM5520a2, MappedKeys.f8557j) ? KeyCommand.f8462p : Key.m5515a(jM5520a2, MappedKeys.f8558k) ? KeyCommand.f8467u : Key.m5515a(jM5520a2, MappedKeys.f8559l) ? KeyCommand.f8468v : null;
        }
        if (keyCommand != null) {
            return keyCommand;
        }
        KeyMappingKt$defaultKeyMapping$2$1 keyMappingKt$defaultKeyMapping$2$1 = KeyMappingKt.f8474a;
        keyMappingKt$defaultKeyMapping$2$1.getClass();
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long jM5520a3 = Key_androidKt.m5520a(keyEvent.getKeyCode());
            if (Key.m5515a(jM5520a3, MappedKeys.f8556i)) {
                keyCommand2 = KeyCommand.f8438O;
            } else if (Key.m5515a(jM5520a3, MappedKeys.f8557j)) {
                keyCommand2 = KeyCommand.f8439P;
            } else if (Key.m5515a(jM5520a3, MappedKeys.f8558k)) {
                keyCommand2 = KeyCommand.f8441R;
            } else if (Key.m5515a(jM5520a3, MappedKeys.f8559l)) {
                keyCommand2 = KeyCommand.f8440Q;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long jM5520a4 = Key_androidKt.m5520a(keyEvent.getKeyCode());
            keyCommand2 = Key.m5515a(jM5520a4, MappedKeys.f8556i) ? KeyCommand.f8456f : Key.m5515a(jM5520a4, MappedKeys.f8557j) ? KeyCommand.f8455d : Key.m5515a(jM5520a4, MappedKeys.f8558k) ? KeyCommand.f8458i : Key.m5515a(jM5520a4, MappedKeys.f8559l) ? KeyCommand.f8457g : Key.m5515a(jM5520a4, MappedKeys.f8550c) ? KeyCommand.f8472z : Key.m5515a(jM5520a4, MappedKeys.f8568u) ? KeyCommand.f8426C : Key.m5515a(jM5520a4, MappedKeys.f8567t) ? KeyCommand.f8425B : Key.m5515a(jM5520a4, MappedKeys.f8555h) ? KeyCommand.f8446W : null;
        } else if (keyEvent.isShiftPressed()) {
            long jM5520a5 = Key_androidKt.m5520a(keyEvent.getKeyCode());
            if (Key.m5515a(jM5520a5, MappedKeys.f8562o)) {
                keyCommand2 = KeyCommand.f8442S;
            } else if (Key.m5515a(jM5520a5, MappedKeys.f8563p)) {
                keyCommand2 = KeyCommand.f8443T;
            }
        } else if (keyEvent.isAltPressed()) {
            long jM5520a6 = Key_androidKt.m5520a(keyEvent.getKeyCode());
            if (Key.m5515a(jM5520a6, MappedKeys.f8567t)) {
                keyCommand2 = KeyCommand.f8427D;
            } else if (Key.m5515a(jM5520a6, MappedKeys.f8568u)) {
                keyCommand2 = KeyCommand.f8428E;
            }
        }
        if (keyCommand2 != null) {
            return keyCommand2;
        }
        KeyMappingKt$commonKeyMapping$1 keyMappingKt$commonKeyMapping$1 = keyMappingKt$defaultKeyMapping$2$1.f8477a;
        keyMappingKt$commonKeyMapping$1.getClass();
        androidx.compose.p013ui.input.key.KeyEvent keyEvent2 = new androidx.compose.p013ui.input.key.KeyEvent(keyEvent);
        Function1 function1 = keyMappingKt$commonKeyMapping$1.f8475a;
        if (((Boolean) function1.invoke(keyEvent2)).booleanValue() && keyEvent.isShiftPressed()) {
            long jM5520a7 = Key_androidKt.m5520a(keyEvent.getKeyCode());
            int i = MappedKeys.f8573z;
            if (Key.m5515a(jM5520a7, MappedKeys.f8554g)) {
                keyCommand3 = KeyCommand.f8450a0;
            }
        } else {
            if (((Boolean) function1.invoke(new androidx.compose.p013ui.input.key.KeyEvent(keyEvent))).booleanValue()) {
                long jM5516a = KeyEvent_androidKt.m5516a(keyEvent);
                int i2 = MappedKeys.f8573z;
                if (Key.m5515a(jM5516a, MappedKeys.f8549b) ? true : Key.m5515a(jM5516a, MappedKeys.f8564q)) {
                    keyCommand3 = KeyCommand.f8469w;
                } else if (Key.m5515a(jM5516a, MappedKeys.f8551d)) {
                    keyCommand3 = KeyCommand.f8470x;
                } else if (Key.m5515a(jM5516a, MappedKeys.f8553f)) {
                    keyCommand3 = KeyCommand.f8471y;
                } else if (Key.m5515a(jM5516a, MappedKeys.f8548a)) {
                    keyCommand3 = KeyCommand.f8429F;
                } else if (Key.m5515a(jM5516a, MappedKeys.f8552e)) {
                    keyCommand3 = KeyCommand.f8450a0;
                } else if (Key.m5515a(jM5516a, MappedKeys.f8554g)) {
                    keyCommand3 = KeyCommand.f8449Z;
                }
            } else if (!keyEvent.isCtrlPressed()) {
                if (keyEvent.isShiftPressed()) {
                    long jM5520a8 = Key_androidKt.m5520a(keyEvent.getKeyCode());
                    int i3 = MappedKeys.f8573z;
                    if (Key.m5515a(jM5520a8, MappedKeys.f8556i)) {
                        keyCommand3 = KeyCommand.f8430G;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8557j)) {
                        keyCommand3 = KeyCommand.f8431H;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8558k)) {
                        keyCommand3 = KeyCommand.f8432I;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8559l)) {
                        keyCommand3 = KeyCommand.f8433J;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8560m)) {
                        keyCommand3 = KeyCommand.f8434K;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8561n)) {
                        keyCommand3 = KeyCommand.f8435L;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8562o)) {
                        keyCommand3 = KeyCommand.f8442S;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8563p)) {
                        keyCommand3 = KeyCommand.f8443T;
                    } else if (Key.m5515a(jM5520a8, MappedKeys.f8564q)) {
                        keyCommand3 = KeyCommand.f8470x;
                    }
                } else {
                    long jM5520a9 = Key_androidKt.m5520a(keyEvent.getKeyCode());
                    int i4 = MappedKeys.f8573z;
                    if (Key.m5515a(jM5520a9, MappedKeys.f8556i)) {
                        keyCommand3 = KeyCommand.f8451b;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8557j)) {
                        keyCommand3 = KeyCommand.f8453c;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8558k)) {
                        keyCommand3 = KeyCommand.f8463q;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8559l)) {
                        keyCommand3 = KeyCommand.f8464r;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8560m)) {
                        keyCommand3 = KeyCommand.f8465s;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8561n)) {
                        keyCommand3 = KeyCommand.f8466t;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8562o)) {
                        keyCommand3 = KeyCommand.f8459j;
                    } else if (Key.m5515a(jM5520a9, MappedKeys.f8563p)) {
                        keyCommand3 = KeyCommand.f8460n;
                    } else {
                        if (Key.m5515a(jM5520a9, MappedKeys.f8565r) ? true : Key.m5515a(jM5520a9, MappedKeys.f8566s)) {
                            keyCommand3 = KeyCommand.f8447X;
                        } else if (Key.m5515a(jM5520a9, MappedKeys.f8567t)) {
                            keyCommand3 = KeyCommand.f8472z;
                        } else if (Key.m5515a(jM5520a9, MappedKeys.f8568u)) {
                            keyCommand3 = KeyCommand.f8424A;
                        } else if (Key.m5515a(jM5520a9, MappedKeys.f8569v)) {
                            keyCommand3 = KeyCommand.f8470x;
                        } else if (Key.m5515a(jM5520a9, MappedKeys.f8570w)) {
                            keyCommand3 = KeyCommand.f8471y;
                        } else if (Key.m5515a(jM5520a9, MappedKeys.f8571x)) {
                            keyCommand3 = KeyCommand.f8469w;
                        } else if (Key.m5515a(jM5520a9, MappedKeys.f8572y)) {
                            keyCommand3 = KeyCommand.f8448Y;
                        }
                    }
                }
            }
        }
        return keyCommand3;
    }
}
