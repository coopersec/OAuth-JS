public class InputData implements InputDataInterface{
    private long id;
    private String name;
    private int gcContentCount;
    private String gcContent;
    private String body;

    public InputData(){
      this.id = 0;
      this.name = "";
      this.gcContent = "";
      this.body = "";
      this.gcContentCount = gcContent.length();
    }

    public long getId(){
      return this.id;
    }

    public String getName(){
      return this.name;
    }

    public int getGcContentCount(){
      return this.gcContentCount;
    }

    public String getGcContent(){
      return this.gcContent;
    }

    public String getBody(){
      return this.body;
    }

    public void setId(long id){
      this.id = id;
    }

    public void setName(String name){
      this.name = name;
    }

    public void setGcContentCount(int gcContentCount){
      this.gcContentCount = gcContentCount;
    }

    public void setGcContent(String gcContent){
      this.gcContent = gcContent;
    }

    public void setBody(String body){
      this.body = body;
    }

  }