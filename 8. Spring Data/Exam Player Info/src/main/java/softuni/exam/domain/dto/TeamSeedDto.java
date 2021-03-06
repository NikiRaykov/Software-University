package softuni.exam.domain.dto;

import org.hibernate.validator.constraints.Length;
import softuni.exam.domain.entities.Picture;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "team")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeamSeedDto {

    public TeamSeedDto(){}

    @XmlElement
    @NotNull
    @Length(min = 3, max = 20)
    private String name;

    @XmlElement
    @NotNull
    private PictureSeedDto picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public PictureSeedDto getPicture() {
        return picture;
    }

    public void setPicture(PictureSeedDto picture) {
        this.picture = picture;
    }
}
