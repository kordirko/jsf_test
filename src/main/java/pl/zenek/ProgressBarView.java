package pl.zenek;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProgressBarView {

    private int progress2 = 33;
    public Integer getProgress2() {
        return progress2;
    }

    public void setProgress2(final Integer progress2) {
        this.progress2 = progress2;
    }
}
