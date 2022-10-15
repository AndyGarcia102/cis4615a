
final class IPHolder {
  private final List<InetAddress> ips =
      Collections.synchronizedList(new ArrayList<InetAddress>());
 
  public void addAndPrintIPAddresses(InetAddress address) {
    ips.add(address);
    InetAddress[] addressCopy =
        (InetAddress[]) ips.toArray(new InetAddress[0]);
    // Iterate through array addressCopy ...
  }
}
