package org.delivery.db.account;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.delivery.db.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true) // true일때 부모에 있는 값까지 포함해서 비교 false일때 entity클래스 안에 있는 값만 비교
@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity {
}
