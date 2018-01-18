package cn.edu.ncut.repository;

import cn.edu.ncut.model.CrawlerURL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/1/18.
 */
@Repository
public interface CrawlerURLRepository extends JpaRepository<CrawlerURL, String> {
}
