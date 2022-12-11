package pl.zenek;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class Kontent1Controller {

    @ManagedProperty(value = "#{progressBarView}")
    private ProgressBarView progressBarView;



    public String runMe() {
        progressBarView.setProgress2(8);
        while(progressBarView.getProgress2() < 100){
            try {
                Thread.sleep(1000);
                Integer progress2 = progressBarView.getProgress2();
                progress2 += 15;
                progressBarView.setProgress2(progress2 < 100 ? progress2 : 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public void setProgressBarView(final ProgressBarView progressBarView) {
        this.progressBarView = progressBarView;
    }

    public ProgressBarView getProgressBarView() {
        return progressBarView;
    }

}
