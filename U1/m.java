package U1;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0393g;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.U;

/* JADX INFO: loaded from: classes.dex */
public class m extends AbstractC0393g {
    public m(BaseViewManager<Object, ? extends U> baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC0393g, com.facebook.react.uimanager.Q0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "presentationStyle":
                ((n) this.f7478a).setPresentationStyle(view, (String) obj);
                break;
            case "supportedOrientations":
                ((n) this.f7478a).setSupportedOrientations(view, (ReadableArray) obj);
                break;
            case "transparent":
                ((n) this.f7478a).setTransparent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((n) this.f7478a).setIdentifier(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((n) this.f7478a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((n) this.f7478a).setAnimated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((n) this.f7478a).setVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((n) this.f7478a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((n) this.f7478a).setHardwareAccelerated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((n) this.f7478a).setAnimationType(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
