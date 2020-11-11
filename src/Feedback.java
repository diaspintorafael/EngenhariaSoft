public class Feedback {

    private Integer id_feedback;
    private String link;
    private String avalicao;

    public Feedback(Integer id_feedback, String link, String avalicao) {
        this.id_feedback = id_feedback;
        this.link = link;
        this.avalicao = avalicao;
    }

    public Integer getId_feedback() { return id_feedback; }

    public void setId_feedback(Integer id_feedback) { this.id_feedback = id_feedback; }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link; }

    public String getAvalicao() { return avalicao; }

    public void setAvalicao(String avalicao) { this.avalicao = avalicao; }
}
