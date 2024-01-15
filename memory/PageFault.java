import java.util.*;

/**
 * A class representing a page replacement strategy using the WSClock algorithm.
 */
public class PageFault {

  /**
   * Replaces a page in the memory with the specified virtual page number using the WSClock algorithm.
   *
   * @param mem             The vector representing the memory pages.
   * @param virtPageNum     The virtual page number to be replaced.
   * @param replacePageNum  The index of the page to replace.
   * @param controlPanel    The control panel for updating the physical page display.
   */

  public static void replacePage(Vector<Page> mem, int virtPageNum, int replacePageNum, ControlPanel controlPanel) {
    int hand = 0;

    while (true) {
      Page page = mem.get(hand);

      if (page.physical == -1) {
        break;
      }

      if (page.R == 0) {
        break;
      }

      page.R = 0;

      hand = (hand + 1) % mem.size();
    }

    Page pageToReplace = mem.get(hand);
    Page newPage = mem.get(replacePageNum);

    if (pageToReplace.physical != -1) {
      controlPanel.removePhysicalPage(hand);
    }

    newPage.physical = pageToReplace.physical;
    controlPanel.addPhysicalPage(newPage.physical, replacePageNum);

    pageToReplace.clear();
  }
}
