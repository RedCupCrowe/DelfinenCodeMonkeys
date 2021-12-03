package Medlemmer;

import java.util.Comparator;

public class CompareSvømmetid implements Comparator<KonkurrenceMedlem> {
  int disciplin;

  public CompareSvømmetid(int disciplin) {
    this.disciplin = disciplin;
  }

  @Override
  public int compare(KonkurrenceMedlem o1, KonkurrenceMedlem o2) {
    switch (disciplin) {
      case 1:
        return (int) (o1.getButterflyTid().getSvømmetid() - o2.getButterflyTid().getSvømmetid());
      case 2:
        return (int) (o1.getCrawlTid().getSvømmetid() - o2.getCrawlTid().getSvømmetid());
      case 3:
        return (int) (o1.getRygCrawlTid().getSvømmetid() - o2.getRygCrawlTid().getSvømmetid());
      case 4:
        return (int) (o1.getBrystTid().getSvømmetid() - o2.getBrystTid().getSvømmetid());


    }
    return 0;

  }
}
